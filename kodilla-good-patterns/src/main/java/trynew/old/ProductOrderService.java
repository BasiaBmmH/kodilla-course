package trynew.old;

/*
Zadanie: stworzenie serwisu zamówień produktów
Wewnątrz pakietu com.kodilla.good.patterns.challenges stwórz klasę ProductOrderService. Serwis powinien zajmować się wykonywaniem zamówień różnego rodzaju produktów – gier, kapci, szczoteczek do zębów... innymi słowy, Allegro :)

Wykorzystaj przykład poniżej jako wzór do swojej implementacji:

public class RentalProcessor {

   private InformationService informationService;
   private RentalService rentalService;
   private RentalRepository rentalRepository;

   public RentalProcessor(final InformationService informationService,
         final RentalService rentalService,
         final RentalRepository rentalRepository) {
      this.informationService = informationService;
      this.rentalService = rentalService;
      this.rentalRepository = rentalRepository;
   }

   public RentalDto process(final RentRequest rentRequest) {
      boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
         rentRequest.getTo());

      if (isRented) {
         informationService.inform(rentRequest.getUser());
         rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
         return new RentalDto(rentRequest.getUser(), true);
      } else {
         return new RentalDto(rentRequest.getUser(), false);
      }
   }
}
Pamiętaj o stworzeniu niezbędnych interfejsów i klas, które będą implementować stworzone interfejsy.
Program należy uruchomić za pomocą metody main(). Program prześlij do repozytorium GitHub.

 */
public class ProductOrderService {
    // TODO we need to save product order
    // TODO we need to log information about ordering process (product type, name, order timestamp).

    public void order(User user, Product product) {

       product.preorder();


    }

}
