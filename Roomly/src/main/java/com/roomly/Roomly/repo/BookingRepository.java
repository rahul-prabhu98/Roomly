package com.roomly.Roomly.repo;

import com.roomly.Roomly.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByRoomId(Long roomId);

    //List<Booking> findByBookingConfirmationCode(String confirmationCode);

    List<Booking> findByUserId(Long id);

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);

}
