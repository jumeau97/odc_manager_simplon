package com.example.backend.controller;
import com.example.backend.model.Participant;
import com.example.backend.service.ParticipantService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api")
public class ParticipantController {
    @Autowired
    ParticipantService participantService;

    @PostMapping(value="/participant")
    public String save(@RequestBody Participant participant){
        participantService.addParticipant(participant);
        return "Participant ajouté avec succèss...";
    }
    @DeleteMapping(value = "/deleteParticipant/{id}")
    public String delete (@PathVariable("id") Long id){
       participantService.deleteParticipant(id);
       return "Participant supprimé avec succèss...";
    }

    @PutMapping(path = "/participant/{id}")
    public Participant update(@RequestBody Participant participant, @PathVariable Long id){
       return participantService.updateParticipant(id,participant);
    }

    //pour afficher la liste
    @GetMapping("/participants")
    @ResponseBody
    public List<Participant> list(){
        return participantService.listParticipant();
    }


    @PostMapping("/uploadexcel")
    public List<Participant> importExcelFile(@RequestParam("file") MultipartFile files) throws IOException, IOException {

        List<Participant> participants = new ArrayList<>();
        System.out.println(files);

        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());

        // lecture du fichier excel
        XSSFSheet worksheet = workbook.getSheetAt(0);
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);
                Participant p = new Participant();

                p.setNom_complet(getCellValue(row, 0));
                p.setTelephone(convertStringToInt(getCellValue(row, 1)));  ;
                p.setStructure(getCellValue(row, 2));
                p.setDomaine(getCellValue(row, 3));
                p.setEmail(getCellValue(row, 4));

                participantService.addParticipant(p);
                System.out.println(p);
            }
        }

        return participants;
    }


    private String getCellValue(Row row, int cellNo) {
        DataFormatter formatter = new DataFormatter();

        Cell cell = row.getCell(cellNo);

        return formatter.formatCellValue(cell);
    }

    private int convertStringToInt(String str) {
        int result = 0;
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            return result;
        }
        result = Integer.parseInt(str);
        return result;
    }
}
