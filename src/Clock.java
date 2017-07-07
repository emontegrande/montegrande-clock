    public class Clock {
        int hr;
        int min;
        int sec;
        private String room;

        Clock(){
            this.hr=0;
            this.min=0;
            this.sec=0;   
            this.room=room;
        }
        
        Clock(int hr, int min, int sec){
            this.hr=hr;
            this.min=min;
            this.sec=sec;
        }
        
        void setTime(int hr, int min, int sec){
            this.hr=hr;
            this.min=min;
            this.sec=sec;
        }
        
        int getHours(){
            return this.hr;
        }
        int getMinutes(){
            return this.min;
        }    
        int getSeconds(){
            return this.sec;
        }
        void printTime(){
            System.out.println(this.hr+"hr:"+this.min+"min:"+this.sec+"sec");
        }
        
        @Override
        public String toString(){
            String result= "";
            result +="In room: "+ room()+"\n";
            return result;
        }
        
        public  void setRoom(String theroom)
        {
          room=theroom;
        }
        
        public String room()
        {
          return "Living Room";
        }
        
        int incrementSeconds(){
            this.sec++;
            if(sec > 59){
                sec = 0;
                incrementMinutes();
            }
            return this.sec;
        }
        
        int incrementMinutes(){
            this.min++;
            if(min > 59){
                min = 0;
                incrementHours();
            }
            return this.min;
        }
        
        int incrementHours(){
            this.hr++;
            if(hr > 59){
                hr = 0;
                incrementHours();
            }
            return this.hr;
        }
        
        public boolean equals(Clock eq){ 
            return (this.hr == eq.hr && this.min == eq.min && this.sec == eq.sec);
        } 
        
        public void makeCopy(Clock copy){
            this.hr = copy.hr;
            this.min = copy.min;
            this.sec = copy.sec;
        }
        
        public Clock getCopy(){
            Clock copy = new Clock();

            copy.hr = hr;
            copy.min = min;
            copy.sec = sec;

            return copy;
        }
        
        int decrementSeconds(){
            this.sec--;
            if(sec < 0){
                sec = 59;
                decrementMinutes();
            }
            return this.sec;   
        }
        
        int decrementMinutes(){
            this.min--;
            if(min < 0){
                min = 59;
                decrementHours();
            }
            return this.min;        
        }
        
        int decrementHours(){
            this.hr--;
            if(hr < 0){
                hr = 0;
            }
            return this.hr;
        }   
}