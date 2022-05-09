package com.shop.repository;

import com.shop.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

// entuty를 만들면 기본적으로 repository를 interface로 생성하여 jparepository를 구현한다.
// ORM
public interface CartRepository extends JpaRepository<Cart,Long> {

}
