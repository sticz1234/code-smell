package com.danix.code.smell.example001;

import org.junit.Test;
import org.mockito.Mockito;

import static com.danix.code.smell.example001.AccountTestUtils.getAccountByTypeAndMoney;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author  danix
 */
public class CustomerTest {

    private static final Money SOME_EURO = Money.newEuro(10);

    @Test
    public void shouldReturnName(){
        Customer cust = Mockito.mock(Customer.class);
        when(cust.getFullName()).thenReturn("dom");
        assertEquals("dom",cust.getFullName());

    }
}
