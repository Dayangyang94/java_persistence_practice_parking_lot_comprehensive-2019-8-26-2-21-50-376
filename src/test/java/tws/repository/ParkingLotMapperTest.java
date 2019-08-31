package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.ParkingLot;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingLotMapperTest {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    ParkingLotMapper parkingLotMapper;
    @Test
    public void insertParkingLot() {
        //given
        ParkingLot parkingLot = new ParkingLot(6,1,1,2);
        //when
        parkingLotMapper.insert(parkingLot);
        //then
        assertEquals(1, JdbcTestUtils.countRowsInTable(jdbcTemplate,"parkingLot"));
    }

    @Test
    public void selectAllParkingLots() {
        //given
        jdbcTemplate.execute("insert into `parkingLot` values(6,1,1,2)");
        //when
        List<ParkingLot> parkingLotList = parkingLotMapper.selectAll();
        //then
        assertEquals(1,parkingLotList.size());
    }

}
