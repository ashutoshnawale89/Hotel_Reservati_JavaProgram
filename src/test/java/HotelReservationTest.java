import org.junit.Assert;
import org.junit.Test;

import com.program.HotelReservation;

public class HotelReservationTest {
	@Test
	 public void addHotel_verifyTheHotel_addorNot_TestCase() {
		 HotelReservation obj =new HotelReservation();
		 String hotelName="LakeWood";
		 String price="Regular Price : 80   WeelEnd Price : 110";
		Assert.assertEquals(true, obj.hotelAddSystem(hotelName, price));
	 }
}
