import org.example.provider.SekToDollar;
import org.example.service.Exchange;

module org.example.provider {
    requires org.example.service;
    provides Exchange with SekToDollar;
}