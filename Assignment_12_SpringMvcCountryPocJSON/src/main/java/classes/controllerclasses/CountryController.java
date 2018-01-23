package classes.controllerclasses;

import classes.beanclasses.Country;
import classes.serviceclasses.CountryService;
import classes.utilityclasses.Countries;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryController
{
    CountryService countryService = new CountryService();

    @RequestMapping(value="/countries",method = RequestMethod.GET, produces = "application/json")
    public List<Country> getAllCountries()
    {
        return countryService.getAllCountries();
    }

    @RequestMapping(value="/countries/{countryId}",method = RequestMethod.GET, produces = "application/json")
    public Country getCountryById(@PathVariable int countryId)
    {
        return countryService.getCountryById(countryId);
    }
}