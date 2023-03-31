from Globals import *


class RecordIndex(tk.Tk):
    def __init__(self, parent, cls_main):
        self.parent = parent
        self.cls_main = cls_main

        self.lblRecordIndex = tk.Label(self.parent, text="Record Index")
        self.lblRecordIndex.grid(column=1, row=2, padx=5, pady=5)

        values = ["Empty"]  # Set values
        self.cmbRecordIndex = ttk.Combobox(self.parent, values=values, state='readonly')
        self.cmbRecordIndex.current(0)
        self.cmbRecordIndex.bind('<<ComboboxSelected>>', self._fnc_set_text_fields)
        self.cmbRecordIndex.grid(column=1, row=3, padx=5, pady=5)

    def _fnc_set_text_fields(self, *args, **kwargs):
        self.cls_main.nameItems.txtName


class Name(tk.Tk):
    def __init__(self, parent):
        self.parent = parent

        self.lblName = tk.Label(self.parent, text="Name")
        self.lblName.grid(column=1, row=5, padx=5, pady=5)

        self.txtName = ttk.Entry(self.parent)
        self.txtName.grid(column=1, row=6, columnspan=2, padx=5, pady=5)
        self.txtName.insert(0, "Empty")  # Set default value

        self.btnNameSort = tk.Button(self.parent, text="Sort Name", command=self._fnc_name_sort)
        self.btnNameSort.grid(column=1, row=7, columnspan=2, padx=5, pady=5)

    @staticmethod
    def _fnc_name_sort():
        # TODO: Access class from Sort.py
        print("Name Sort")


class Class(tk.Tk):
    def __init__(self, parent):
        self.parent = parent

        self.lblClass = tk.Label(self.parent, text="Class")
        self.lblClass.grid(column=4, row=5, padx=5, pady=5)

        self.txtClass = tk.Entry(self.parent)
        self.txtClass.grid(column=4, row=6, columnspan=2, padx=5, pady=5)
        self.txtClass.insert(0, "Empty")  # Set default value

        self.btnClassSort = tk.Button(self.parent, text="Sort Class", command=self.fnc_class_sort)
        self.btnClassSort.grid(column=4, row=7, columnspan=2, padx=5, pady=5)

    @staticmethod
    def fnc_class_sort():
        # TODO: Access class from Sort.py
        print("Class Sort")


class Year(tk.Tk):
    def __init__(self, parent):
        self.parent = parent

        self.lblYear = tk.Label(self.parent, text="Year")
        self.lblYear.grid(column=7, row=5, padx=5, pady=5)

        self.txtYear = tk.Entry(self.parent)
        self.txtYear.grid(column=7, row=6, columnspan=2, padx=5, pady=5)
        self.txtYear.insert(0, "Empty")  # Set default value

        self.btnYearSort = tk.Button(self.parent, text="Sort Year", command=self.fnc_year_sort)
        self.btnYearSort.grid(column=7, row=7, columnspan=2, padx=5, pady=5)

    @staticmethod
    def fnc_year_sort():
        # TODO: Access class from Sort.py
        print("Year Sort")
