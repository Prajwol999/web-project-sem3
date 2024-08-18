package com.example.prajwol;

import com.example.prajwol.entity.Item;
import com.example.prajwol.repository.ItemRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ItemRepositoryTests {
    @Autowired
    private ItemRepository itemRepository;

    @Test
    @Order(1)
    @Rollback(false)
    public void saveItem() {
        Item item = new Item();
        item.setItemName("item");
        item.setItemDescription("desc");
        itemRepository.save(item);
        Assertions.assertThat(item.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
    public void findItemByIdTest() {
        Item item = itemRepository.findById(1).get();
        Assertions.assertThat(item).isNotNull();
    }

    @Test
    @Order(3)
    public void findListOfItemsTest() {
        List<Item> posts = itemRepository.findAll();
        Assertions.assertThat(posts).isNotNull();
    }

    @Test
    @Order(4)
    public void updateListTest() {
        Item item = itemRepository.findById(1).get();
        item.setItemName("item name");
        itemRepository.save(item);
        Assertions.assertThat(item.getItemName()).isEqualTo("item name");
    }

    @Test
    @Order(5)
    public void deletePostTest() {
        Item item = itemRepository.findById(1).get();
        itemRepository.delete(item);
        Assertions.assertThat(itemRepository.existsById(1)).isFalse();
    }
}