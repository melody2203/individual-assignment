package DSA_Individual_project;

public class Tasks {
        private String title;
        private String description;
        private boolean completed;
    
        public void Task(String title, String description) {
            this.title = title;
            this.description = description;
            this.completed=false; 
        }
    
        public String getTitle() {
            return title;
        }
    
        public String getDescription() {
            return description;
        }
        public boolean isCompleted() {
            return this.completed;
        }
    
        public void markCompleted() {
            this.completed = true;
        }
}
