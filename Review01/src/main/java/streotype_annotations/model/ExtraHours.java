package streotype_annotations.model;

import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
@Builder
public class ExtraHours {
    public Integer extraHours(){
        return 10;
    }
}
