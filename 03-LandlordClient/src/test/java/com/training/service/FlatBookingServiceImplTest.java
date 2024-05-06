package com.training.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.Service.FlatBookingServiceImpl;
import com.training.bean.FlatBooking;
import com.training.dao.FlatBookingDAO;

@SpringBootTest
public class FlatBookingServiceImplTest {

	@Mock
	private FlatBookingDAO flatBookingDAOMock;

	@InjectMocks
	private FlatBookingServiceImpl flatBookingService;

	

	@Test
	public void testAddFlatBooking() {
		FlatBooking inputFlatBooking = new FlatBooking(); // Create a sample flat booking object
		when(flatBookingDAOMock.save(inputFlatBooking)).thenReturn(inputFlatBooking);

		FlatBooking result = flatBookingService.addFlatBooking(inputFlatBooking);

		assertNotNull(result);
		assertEquals(inputFlatBooking, result);
		verify(flatBookingDAOMock, times(1)).save(inputFlatBooking);
	}

	@Test
	public void testUpdateFlatBooking() {
		FlatBooking inputFlatBooking = new FlatBooking(); // Create a sample flat booking object
		when(flatBookingDAOMock.save(inputFlatBooking)).thenReturn(inputFlatBooking);

		FlatBooking result = flatBookingService.updateFlatBooking(inputFlatBooking);

		assertNotNull(result);
		assertEquals(inputFlatBooking, result);
		verify(flatBookingDAOMock, times(1)).save(inputFlatBooking);
	}

	@Test
	public void testDeleteFlatBooking() {
		FlatBooking inputFlatBooking = new FlatBooking(); // Create a sample flat booking object
		String expectedResult = "Flat Booking Deleted Succesfully";

		flatBookingService.deleteFlatBooking(inputFlatBooking);

		verify(flatBookingDAOMock, times(1)).delete(inputFlatBooking);
	}

	@Test
	public void testGetFlatBookingById_ExistingId() {
		int bookingNo = 123; // Sample booking number
		FlatBooking expectedFlatBooking = new FlatBooking(); // Create a sample flat booking object
		when(flatBookingDAOMock.findById(bookingNo)).thenReturn(Optional.of(expectedFlatBooking));

		FlatBooking result = flatBookingService.getFlatBookingById(bookingNo);

		assertNotNull(result);
		assertEquals(expectedFlatBooking, result);
		verify(flatBookingDAOMock, times(1)).findById(bookingNo);
	}

	@Test
	public void testGetFlatBookingById_NonExistingId() {
		int bookingNo = 456; // Sample booking number
		when(flatBookingDAOMock.findById(bookingNo)).thenReturn(Optional.empty());

		FlatBooking result = flatBookingService.getFlatBookingById(bookingNo);

		assertNull(result);
		verify(flatBookingDAOMock, times(1)).findById(bookingNo);
	}

	@Test
	public void testGetAllFlatBooking() {
		List<FlatBooking> expectedList = new ArrayList<>(); // Create a sample list of flat bookings
		when(flatBookingDAOMock.findAll()).thenReturn(expectedList);

		List<FlatBooking> result = flatBookingService.getAllFlatBooking();

		assertNotNull(result);
		assertEquals(expectedList, result);
		verify(flatBookingDAOMock, times(1)).findAll();
	}
}