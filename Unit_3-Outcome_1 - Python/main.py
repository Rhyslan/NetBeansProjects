from RecordDisplay import *
from RecordActions import *

# Constants
N = tk.N
S = tk.S
E = tk.E
W = tk.W


class Exit(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        btnExit = tk.Button(self.parent, text="Exit", command=self.fncExit)
        btnExit.grid(column=9, row=13, padx=5, pady=5)

    def fncExit(self):
        quit()


class clsMainApplication(tk.Tk):
    def __init__(self):
        super().__init__("clsMainApplication")

        # Window Set Up
        self.title("Student Records")
        for i in range(9):
            self.columnconfigure(i, minsize=85, weight=1)
        for i in range(13):
            self.rowconfigure(i, minsize=19, weight=1)

        # set up widgets
        self.lblHeading = tk.Label(self, text="Heading")
        self.lblHeading.grid(column=0, row=0, columnspan=9, padx=5, pady=5)



        # Add widgets from classes
        self.recordIndex = RecordIndex(self)
        self.nameItems = Name(self)
        self.classItems = Class(self)
        self.yearItems = Year(self)
        self.load = Load(self)
        self.add = AddRecord(self)
        self.edit = EditRecord(self)
        self.save = SaveFile(self)
        self.exit = Exit(self)

    def fncExit(self):
        quit()


if __name__ == "__main__":
    root = clsMainApplication()
    root.mainloop()
