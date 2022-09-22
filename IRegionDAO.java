//interfaces dari RegionDAO (IRegionDAO).



package daos.interfaces;

import java.util.List;
import models.Region;

/**
 *
 * @author Admin
 */
public interface IRegionDAO {
    public List<Region> getAll ();
    public Region getById (int region_id);
    public boolean insert (Region region);
    public boolean update (Region region);
    public boolean delete (int region_id);

    public boolean delete(Region region);
    public boolean getById(Region region);
}
