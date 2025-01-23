package br.com.pdi.hexagonal.infrastructure.dtos;

public record NewEventDTO(
        String name,
        String date,
        Integer totalSpots,
        String partnerId
) {

}
