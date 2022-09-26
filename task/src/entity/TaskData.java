package entity;

/**
 * タスクデータを管理する
 * @author Horita
 */
public class TaskData {

	private int id;				// タスクID
	private String taskName;	// タスク名
	private String status;		// タスクのステータス
	
	/**
	 * タスク情報を保存する
	 * @param id
	 * @param taskName
	 * @param status
	 */
	public TaskData(int id, String taskName, String status) {
		this.id = id;
		this.taskName = taskName;
		this.status = status;
	}

	/**
	 * id取得用
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * タスク名取得用
	 * @return
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * ステータス取得用
	 * @return
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * ステータス更新用
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
        return "ID:" +  id + " タスク名:"+ taskName + " ステータス:" + status;
    }
	
}
