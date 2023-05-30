package com.codecademy.boots.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.boots.entities.Boot;
import com.codecademy.boots.enums.BootType;

public interface BootRepository extends CrudRepository<Boot, Integer> {
  public List<Boot> findByMaterial(String material);
  public List<Boot> findByType(BootType type);
  public List<Boot> findBySize(Float size);
  public List<Boot> findByQuantityGreaterThanEqual(Integer quantity);

  public List<Boot> findByMaterialAndTypeAndSizeAndQuantityGreaterThanEqual(String material, BootType type, Float size, Integer quantity);
  public List<Boot> findByMaterialAndTypeAndSize(String material, BootType type, Float size);
  public List<Boot> findByMaterialAndTypeAndQuantityGreaterThanEqual(String material, BootType type, Integer quantity);
  public List<Boot> findByMaterialAndType(String material, BootType type);

  public List<Boot> findByTypeAndSizeAndQuantityGreaterThanEqual(BootType type, Float size, Integer quantity);
  public List<Boot> findByTypeAndSize(BootType type, Float size);
  public List<Boot> findByTypeAndQuantityGreaterThanEqual(BootType type, Integer quantity);

  public List<Boot> findBySizeAndQuantityGreaterThanEqual(Float size, Integer quantity);
  public List<Boot> findAll();
}
