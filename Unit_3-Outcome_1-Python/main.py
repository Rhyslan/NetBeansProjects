from Globals import *

from RecordDisplay import *
from RecordActions import *
from Search import *
from Sort import *


class Exit(tk.Tk):
    def __init__(self, parent):
        self.parent = parent

        btn_exit = tk.Button(self.parent, text="Exit", command=self.fnc_exit)
        btn_exit.grid(column=9, row=13, padx=5, pady=5)

    @staticmethod
    def fnc_exit():
        quit()


class MainApplication(tk.Tk):
    def __init__(self):
        super().__init__("MainApplication")

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
        self.recordIndex = RecordIndex(self, self)
        self.nameItems = Name(self)
        self.classItems = Class(self)
        self.yearItems = Year(self)
        self.load = Load(self, self)
        self.add = AddRecord(self)
        self.edit = EditRecord(self)
        self.save = SaveFile(self)
        self.exit = Exit(self)
        self.search = Search(self)
        self.sort = Sort(self)


if __name__ == "__main__":
    root = MainApplication()
    root.mainloop()
