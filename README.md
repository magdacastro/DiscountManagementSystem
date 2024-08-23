# Order Management System

Este projeto implementa um sistema de gerenciamento de pedidos em Java, com foco na aplicação de descontos conforme o tipo de cliente. 

### Padrão de Projeto Utilizado

O projeto utiliza o **Factory Pattern** para aplicar descontos ao pedido. A fábrica (`DiscountFactory`) cria instâncias de objetos que implementam a interface `iDiscount`, permitindo que diferentes tipos de desconto sejam aplicados com base no cliente ou em outras regras de negócios.


