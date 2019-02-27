package global.sesoc.mini.dao;

import global.sesoc.mini.vo.CustomerVO;

public interface CustomerMapper {

	public int insertCustomer(CustomerVO vo);

	public CustomerVO searchCustomer(String email);
}
