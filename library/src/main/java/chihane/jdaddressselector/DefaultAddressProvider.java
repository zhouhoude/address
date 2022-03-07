package chihane.jdaddressselector;

import chihane.jdaddressselector.model.City;
import chihane.jdaddressselector.model.County;
import chihane.jdaddressselector.model.Province;
import chihane.jdaddressselector.model.Street;

/**
 * @ProjectName: DanaDarurat
 * @Package: chihane.jdaddressselector
 * @ClassName: DefaultAddressProvider
 * @Description: java类作用描述
 * @Author: jtao
 * @CreateDate: 2022/3/7 3:43 下午
 * @UpdateUser: 更新者
 * @UpdateDate: 2022/3/7 3:43 下午
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DefaultAddressProvider implements AddressProvider{
    @Override
    public void provideProvinces(AddressReceiver<Province> addressReceiver) {

    }

    @Override
    public void provideCitiesWith(int provinceId, AddressReceiver<City> addressReceiver) {

    }

    @Override
    public void provideCountiesWith(int cityId, AddressReceiver<County> addressReceiver) {

    }

    @Override
    public void provideStreetsWith(int countyId, AddressReceiver<Street> addressReceiver) {

    }
}
