import java.time.LocalDate;
import java.time.Month;

public class VideoGame {

    private String name;
    private int price;
    private int games_qtde;
    private int discount;
    private LocalDate release_date;

    public VideoGame(String name) {
        this.name = name;
    }

    public VideoGame(String name, int price, int games_qtde, LocalDate release_date) {
        this.name = name;
        this.price = price;
        this.games_qtde = games_qtde;
        this.release_date = release_date;
    }

    public int aplicarDesconto() {
        return price - discount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGames_qtde() {
        return games_qtde;
    }

    public void setGames_qtde(int games_qtde) {
        this.games_qtde = games_qtde;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate release_date) throws ErroneousValueException {
        if(release_date.isBefore(LocalDate.of(2020, Month.NOVEMBER, 12))) {
            this.release_date = release_date;
        } else {
            throw new ErroneousValueException();
        }
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) throws ErroneousValueException {
        if(discount < this.getPrice() && discount > 0) {
            this.discount = discount;
        } else {
            throw new ErroneousValueException();
        }
    }
}
