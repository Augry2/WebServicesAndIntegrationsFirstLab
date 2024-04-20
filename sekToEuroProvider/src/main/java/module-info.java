import org.sekToEuroProvider.SekToEuro;
import org.example.service.Exchange;

module org.example.sekToEuroProvider {
    requires org.example.service;
    provides Exchange with SekToEuro;
}