package egovframework.example.reservation.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.reservation.mapper.ReservationMapper;
import egovframework.example.reservation.service.ReservationService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("reservationService")
public class ReservationServiceImpl extends EgovAbstractServiceImpl implements ReservationService {
	
	@Resource(name = "reservationMapper")
	private ReservationMapper mapper;
	
	@Override
	public String testdb() {
		return mapper.testdb();
	}

}
