import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class VideoGameTest {

    @Test
    public void testMeuPrimeiroTeste() {
        assertEquals("Valores devem ser iguais", 2, 2);
        assertNotEquals("Valores não devem ser iguais",2,8);
    }
















    private static final int PS4_PRICE = 2000;
    private static final int PS5_PRICE = 10000;

    private static final String PS4_NAME = "PS4";
    private static final String PS5_NAME = "PS5";

    private static final int PS4_GAMES_QTDE = 20000;
    private static final int PS5_GAMES_QTDE = 10;

    private static final LocalDate PS4_RELEASE_DATE = LocalDate.of(2013, Month.JANUARY, 15);
    private static final LocalDate PS5_RELEASE_DATE = LocalDate.now();

    private VideoGame ps4;
    private VideoGame ps5;

    @Before
    public void bananinha() throws Exception {
        this.ps4 = new VideoGame(PS4_NAME, PS4_PRICE, PS4_GAMES_QTDE, PS4_RELEASE_DATE);
        this.ps5 = new VideoGame(PS5_NAME, PS5_PRICE, PS5_GAMES_QTDE, PS5_RELEASE_DATE);
    }

    @After
    public void gaiabinha() throws Exception {
        this.ps4 = null;
        this.ps5 = null;
    }

    @Test(timeout = 500)
    public void getPrice() {
        assertEquals("Valor deve ser igual", this.ps4.getPrice(), PS4_PRICE);
        assertNotEquals("Valor deve ser diferente", this.ps4.getPrice(), this.ps5.getPrice());

        assertSame("Tem de ser o mesmo objeto", this.ps4, this.ps4);
        assertNotSame("Tem de ser outro objeto", this.ps4, this.ps5);

        assertNotNull("Esse valor não pode ser nulo", this.ps4.getName());


    }




    @Test
    public void testSeAplicaDesconto() throws ErroneousValueException {
        this.ps4.setDiscount(1000);
        int valor_desconto = this.ps4.aplicarDesconto();
        assertTrue(
                "Valor final não pode ser menor que 0 e maior igual ao valor normal do console",
                valor_desconto >= 0 &&
                        valor_desconto < this.ps4.getPrice()
        );
    }

    @Test
    public void setPrice() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getGames_qtde() {
    }

    @Test
    public void setGames_qtde() {
    }

    @Test
    public void getRelease_date() {

    }

    @Test(expected = ErroneousValueException.class)
    public void setRelease_date() throws ErroneousValueException {
        this.ps4.setRelease_date(LocalDate.now());
    }

    @Test
    public void getDesconto() {
    }

    @Test
    public void setDesconto() {
    }


}