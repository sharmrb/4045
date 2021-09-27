package Assignment0.service;



import Assignment0.dto.Assignment0DTO;


/** CRUD operation for specimen
 * @author Administrator
 *
 */

public interface IAssignment0service {
	
	/**get specimen persistence layer
	 * @param id a unique lookup
	 *@return a student with a matching id
	 */

	Assignment0DTO fetchby(int id);
	/** persist the given DTO
	 * @param Assignment0DTO
	 *
	 */
	void save(Assignment0DTO Assignment0DTO);


}
