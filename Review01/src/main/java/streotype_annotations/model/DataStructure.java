package streotype_annotations.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
@Data
public class DataStructure {
  //  @Autowired
    @NonNull
    ExtraHours extraHours;
   // @Autowired
//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("Total hours: "+(35+extraHours.extraHours()));
    }
}
