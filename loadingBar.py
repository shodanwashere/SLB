class LoadingBar:
    def __init__(self, total):
        self._total_perc = total
        self._curr_status = 0
    
    def update_curr_status(self, new_status):
        self._curr_status = new_status

    def get_perc(self):
        return (float(self._curr_status)/float(self._total_perc)) * 100

    def show_loading_bar(self):
        print("[", end="")
        for j in range(1,4):
            print("=" if j < (self.get_perc() / 10) else " ", end="")
        perc = str(get_perc)+"%"
        print(perc, end="")
        for j in range(3+len(perc), 11):
            print("=" if j < (self.get_perc() / 10) else " ", end="")
        print("]",end="\r")
