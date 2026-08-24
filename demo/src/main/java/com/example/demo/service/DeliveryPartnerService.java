package com.example.demo.service;

import com.example.demo.model.DeliveryPartner;
import com.example.demo.repository.DeliveryPartnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryPartnerService {

    private final DeliveryPartnerRepository deliveryPartnerRepository;

    public DeliveryPartnerService(
            DeliveryPartnerRepository deliveryPartnerRepository) {

        this.deliveryPartnerRepository = deliveryPartnerRepository;
    }

    public DeliveryPartner createDeliveryPartner(
            DeliveryPartner deliveryPartner) {

        return deliveryPartnerRepository.save(deliveryPartner);
    }

    public List<DeliveryPartner> getAllDeliveryPartners() {
        return deliveryPartnerRepository.findAll();
    }

    public DeliveryPartner getDeliveryPartnerById(Long id) {
        return deliveryPartnerRepository.findById(id)
                .orElse(null);
    }

    public DeliveryPartner updateDeliveryPartner(
            Long id,
            DeliveryPartner updatedPartner) {

        DeliveryPartner existingPartner =
                deliveryPartnerRepository.findById(id)
                        .orElse(null);

        if (existingPartner == null) {
            return null;
        }

        // Add fields here based on your DeliveryPartner entity.

        return deliveryPartnerRepository.save(existingPartner);
    }

    public void deleteDeliveryPartner(Long id) {
        deliveryPartnerRepository.deleteById(id);
    }
}