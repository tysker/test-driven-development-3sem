package dk.lyngby.kata5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarCodesTest {
    private BarCodes barCodes;

    @BeforeEach
    void setUp() {
        barCodes = new BarCodes();
    }

    @Test
    @DisplayName("Barcode 12345 should display price $7.25")
    void barcode12345ShouldReturnPrice() {
        assertEquals("$7.25", barCodes.scanProduct(12345));
    }

    @Test
    @DisplayName("Barcode 23456 should display price $12.50")
    void barcode23456ShouldReturnPrice() {
        assertEquals("$12.50", barCodes.scanProduct(23456));
    }

    @Test
    @DisplayName("Barcode 0 should display error message")
    void emptyBarcodeShouldReturnErrorMessage() {
        assertEquals("Invalid bar-code", barCodes.scanProduct(0));
    }

    @Test
    void beAbleToAddMultipleBarcodes() {
        barCodes.scanProduct(12345);
        barCodes.scanProduct(23456);
        assertEquals("$19.75", barCodes.getTotal());
    }
}