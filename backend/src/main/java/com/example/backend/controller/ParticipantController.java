package com.example.backend.controller;
import com.example.backend.model.Participant;
import com.example.backend.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    /* @PostMapping("/uploadexcel")
    public List<PartcipantModel> importExcelFile(@RequestParam("file") MultipartFile files)throws IOException {

        List<PartcipantModel> participants = new ArrayList<>();

        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());

        // lecture du fichier excel
        XSSFSheet worksheet = workbook.getSheetAt(0);
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                XSSFRow row = worksheet.getRow(index);
                PartcipantModel pModel = new PartcipantModel();

                pModel.nomcomplet = getCellValue(row, 0);
                pModel.telephonep = convertStringToInt(getCellValue(row, 1));
                pModel.emailp = getCellValue(row, 2);
                pModel.domainep = getCellValue(row, 3);
                pModel.structurep = getCellValue(row, 4);

                participants.add(pModel);
            }
        }

        // enregistrement dans la base de donnée
        List<Participant> parc = new ArrayList<>();
        if (participants.size() > 0) {
            participants.forEach(x->{
                Participant pp = new Participant();
                pp.nom_complet = x.nomcomplet;
                pp.telephone = x.telephonep;
                pp.email = x.emailp;
                pp.structure = x.structurep;
                pp.domaine = x.domainep;
                parc.add(pp);
            });
            participantService.ajoutExcel();
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
    }*/
}
