# Will contain search textfield, name, class and year radio buttons and search button

# TODO: Put following code into class and tidy up

txtSearchEntry = tk.Entry(win)
txtSearchEntry.grid(column=5, row=10, columnspan=2, padx=5, pady=5)
txtSearchEntry.insert(0, "Search")

btnSearch = tk.Button(win, text="Search")
btnSearch.grid(column=7, row=10, padx=5, pady=5)

rtnNameSearch = tk.Radiobutton(win, text="Name", value=1)
rtnNameSearch.grid(column=5, row=11, padx=5, pady=5)

rtnClassSearch = tk.Radiobutton(win, text="Class", value=2)
rtnClassSearch.grid(column=6, row=11, padx=5, pady=5)

rtnYearSearch = tk.Radiobutton(win, text="Year", value=3)
rtnYearSearch.grid(column=7, row=11, padx=5, pady=5)