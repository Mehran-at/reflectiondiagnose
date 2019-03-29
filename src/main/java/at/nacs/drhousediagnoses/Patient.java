package at.nacs.drhousediagnoses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class Patient {
    private String id;
    private String name;
    private String symptoms;
    private String diagnosis;
    private String medicine;

}
