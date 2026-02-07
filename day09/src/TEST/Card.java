package TEST;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String color;
    private String number;

    @Override
    public String toString() {
        return color+number;
    }
}
