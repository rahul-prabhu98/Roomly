package com.roomly.Roomly.service.interfac;

import com.roomly.Roomly.dto.Response;
import com.roomly.Roomly.entity.Booking;

public interface IBookService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
