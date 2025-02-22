package JavaProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import JavaProject.models.Trip;
import JavaProject.repositories.TripRepository;
@Service
public class TripService {
	private final TripRepository tripRepository;

	public TripService(TripRepository tripRepository) {
		super();
		this.tripRepository = tripRepository;
	}
	
	public Trip createTrip(Trip t) {
	return tripRepository.save(t);

}
public List<Trip> findAllTrip(){
	return tripRepository.findAll();
	
}
public Trip findById(Long id) {
Optional <Trip> optionalTrip = tripRepository.findById(id);
if(optionalTrip.isPresent()) {
	return optionalTrip.get();
}
return null;
}
public void deleteTrip(Trip t) {
	tripRepository.delete(t);
}
}