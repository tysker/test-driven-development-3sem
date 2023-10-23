package dk.lyngby.kata4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchTest {

    private Search search;

    @BeforeEach
    void setUp() {
        search = new Search();
    }

    @Test
    public void ifSearchInputIsLowerThanTwoCharactersReturnEmptyString() {
        assertEquals("", search.search("ab"));
    }

    @Test
    public void ifSearchInputIsMoreThanTwoCharactersReturnCities() {
        assertEquals("Valencia, Vancouver", search.search("Va"));
    }

    @Test
    public void searchFuntionShouldBeCaseInsensitive() {
        assertEquals("Valencia, Vancouver", search.search("va"));
    }

    @Test
    public void shouldReturnValuesEvenIfInputIsOnlyPartOfCityName() {
        assertEquals("Budapest", search.search("ape"));
    }

    @Test
    public void ifInputIsAstrixReturnAllCities() {
        assertEquals("Paris, Budapest, Skopje, Rotterdam, Valencia, Vancouver, Amsterdam, Vienna, Sydney, New York City, London, Bangkok, Hong Kong, Dubai, Rome, Istanbul", search.search("*"));
    }
}