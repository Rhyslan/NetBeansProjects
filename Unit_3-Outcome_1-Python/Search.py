from Globals import *


class Search(tk.Tk):
    def __init__(self, parent):
        self.parent = parent

        self.txtSearchEntry = tk.Entry(self.parent)
        self.txtSearchEntry.grid(column=5, row=10, columnspan=2, padx=5, pady=5)
        self.txtSearchEntry.insert(0, "Search")

        self.btnSearch = tk.Button(self.parent, text="Search")
        self.btnSearch.grid(column=7, row=10, padx=5, pady=5)

        self.rtnNameSearch = tk.Radiobutton(self.parent, text="Name", value=1)
        self.rtnNameSearch.grid(column=5, row=11, padx=5, pady=5)

        self.rtnClassSearch = tk.Radiobutton(self.parent, text="Class", value=2)
        self.rtnClassSearch.grid(column=6, row=11, padx=5, pady=5)

        self.rtnYearSearch = tk.Radiobutton(self.parent, text="Year", value=3)
        self.rtnYearSearch.grid(column=7, row=11, padx=5, pady=5)


def fnc_search(sas_input, str_search_item):
    int_left = 0
    int_right = len(sas_input) - 1

    while int_left <= int_right:
        int_current = int_left + (int_right - int_left) / 2

        if str_search_item == sas_input[int_current]:
            return int_current

        if str_search_item > sas_input[int_current]:
            int_left = int_current + 1
        else:
            int_right = int_current - 1

    return -1
