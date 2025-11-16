package level2;

import level2.client.Contact;
import level2.concreteFactory.SpainContactFactory;
import level2.concreteFactory.USAContactFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatTest {

   private SpainContactFactory spainFactory;
   private Contact contactSpain;
   private USAContactFactory usaFactory;
   private Contact contactUSA;


   @BeforeEach
   void setup(){
       spainFactory = new SpainContactFactory("Carrer Florida 67","Mongat", "08992","677 84 53 44" );
       contactSpain =  new Contact(spainFactory);

       usaFactory = new USAContactFactory("154 5th Avenue", "New York", "NY 10001", "987654321");
       contactUSA = new Contact(usaFactory);
   }

    @Test
    void givenANewFactory_whenFormatTheData_thenSpainFormatOutTrueExpected(){

       String expected = "Address: Carrer Florida 67, Mongat, 08992 | Phone:  +34 677 84 53 44";

       assertEquals(expected, contactSpain.paintContact());

    }

    @Test
    void  givenANewFactory_whenFormatTheData_thenUsAFormatOutTrueExpected(){

       String expected = "Address: 154 5th Avenue, New York, NY 10001 | Phone:  +1 987654321";

       assertEquals(expected,  contactUSA.paintContact());

    }
}
