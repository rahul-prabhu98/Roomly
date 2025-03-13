package com.roomly.Roomly.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.roomly.Roomly.entity.Booking;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {

    private String roomType;
    private BigDecimal roomPrice;
    private String roomPhotoUrl;
    private String roomDiscription;
    private List<BookingDTO> bookings;

}
