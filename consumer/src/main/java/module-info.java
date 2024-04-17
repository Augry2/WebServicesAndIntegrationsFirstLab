import org.example.service.Exchange;

module org.example.consumer {
    requires org.example.service;
    uses Exchange;
}