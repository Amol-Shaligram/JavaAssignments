package classes.serviceclasses;

import classes.beanclasses.Country;
import classes.utilityclasses.Countries;

import java.util.List;

public class CountryService
{

    public List<Country> getAllCountries()
    {
        return Countries.createCountryList();
    }

    public Country getCountryById(int id)
    {
        List<Country> countryList = Countries.createCountryList();
        countryList = Countries.createCountryList();
        for(Country country : countryList)
        {
            if(country.getId() == id)
            {
                return country;
            }
        }
        return null;
    }
}
