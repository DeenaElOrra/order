package store.order;

import java.util.List;

import lombok.Builder;

@Builder
public record OrderOut(
    String id,
    String idAccount,
    String date,
    List<OrderItemOut> items,
    Double total
) {}