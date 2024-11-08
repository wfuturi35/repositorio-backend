package cultureapp.com.pe.event;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record EventRequest(
        Integer id,
        @NotNull(message = "100")
        @NotEmpty(message = "100")
        String title,
        @NotNull(message = "101")
        @NotEmpty(message = "101")
        String description,
        LocalDate start_date,
        Float price,
        @NotNull(message = "103")
        @NotEmpty(message = "103")
        String imgEvent,
        boolean shareable,
        boolean archived,
        @NotNull(message = "103")
        @NotEmpty(message = "103")
        String company,
        String urlEvent,
        @NotNull @Min(1)
        Integer categoryId,
        @NotNull @Min(1)
        Integer regionId

) {
}
