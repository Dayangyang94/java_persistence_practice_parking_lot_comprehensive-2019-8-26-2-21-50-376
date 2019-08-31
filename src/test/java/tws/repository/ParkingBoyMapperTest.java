package tws.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.dto.ParkingBoyDto;
import tws.entity.ParkingBoy;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingBoyMapperTest {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    ParkingBoyMapper parkingBoyMapper;
    @Test
    public void insertParkingBoy(){
        //given
        ParkingBoy parkingBoy=new ParkingBoy(1,"luna");
        //when
        parkingBoyMapper.insert(parkingBoy);
        //then
        assertEquals(1, JdbcTestUtils.countRowsInTable(jdbcTemplate,"parkingBoy"));
    }
    @Test
    public void selectParkingBoy(){
        //given
        jdbcTemplate.execute("insert  into `parkingBoy` values(2,'lunan')");
        //when
        List<ParkingBoy> parkingBoys= parkingBoyMapper.selectAll();
        //then
        assertEquals(1,parkingBoys.size());
    }
    @Test
    public void selectParkingDto(){
        //given
        jdbcTemplate.execute("insert  into `parkingBoy` values(1,'luna')");
        jdbcTemplate.execute("insert into `parkingLot` values(6,1,1,1)");
        //when
        List<ParkingBoyDto> parkingBoyDtos = parkingBoyMapper.selectAllParkingDto();
        //then
        assertEquals(1,parkingBoyDtos.size());


    }


}
