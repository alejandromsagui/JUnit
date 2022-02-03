package es.iessoterohernandez.daw.endes.PruebaJunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({CuentaTest.class, MovimientoTest.class})
public class AllTests {

}
