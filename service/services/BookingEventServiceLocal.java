package tn.esprit.b3.esprit1718b3hrboard.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.b3.esprit1718b3hrboard.entities.BookingEvent;
import tn.esprit.b3.esprit1718b3hrboard.entities.Event;
import tn.esprit.b3.esprit1718b3hrboard.entities.User;
import tn.esprit.b3.esprit1718b3hrboard.utilities.IGenericDAO;

@Local
public interface BookingEventServiceLocal extends IGenericDAO<BookingEvent>{
	public List<BookingEvent> search(Event e, User uu);
	public List<BookingEvent> findbyEvent(Event e);
	public List<BookingEvent> findMyBooking(Event e,User u);

}
