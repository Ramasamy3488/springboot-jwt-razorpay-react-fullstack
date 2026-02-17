package in.bushansirgur.foodiesapi.service;

import in.bushansirgur.foodiesapi.io.CartRequest;
import in.bushansirgur.foodiesapi.io.CartResponse;
import in.bushansirgur.foodiesapi.io.UserResponse;

public interface CartService {

//    void addToCart(String foodId);
      CartResponse addToCart(CartRequest request);
      CartResponse getCart();
      void clearCart();
      CartResponse removeFromCart(CartRequest cartRequest);

//    CartResponse addToCart(CartRequest request);

//    void clearCart();
//    CartResponse removeFromCart(CartRequest cartRequest);


}
