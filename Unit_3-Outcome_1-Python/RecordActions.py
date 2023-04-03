from Globals import *


class Load(tk.Tk):
    def __init__(self, parent, cls_main):
        self.parent = parent
        self.clsGlobals = Global()
        self.clsMain = cls_main

        btn_load = tk.Button(self.parent, text="Load Record", command=self.fnc_load)
        btn_load.grid(column=0, row=11, padx=5, pady=1.5, sticky=N + S + E + W)

    def fnc_load(self):
        pth_record_file = filedialog.askopenfilename(initialdir=os.getcwd(), title="Select File",
                                                     filetypes=(("Text files", "*.txt*"), ("all files", "*.*")),
                                                     initialfile="record2.txt")
        if pth_record_file != '':
            self.clsGlobals.pthDataFile = pth_record_file
        else:
            return

        fil_opened_file = open(self.clsGlobals.pthDataFile, "r")
        str_delimiter = ", "

        self.clsGlobals.masRecords = [[0 for _ in range(3)] for _ in
                                      range(self.clsGlobals.mth_get_file_length(self.clsGlobals.pthDataFile))]

        int_record_index = 0

        for x in fil_opened_file:
            x = x.replace("\n", "")
            Global.masRecords.append(x.split(str_delimiter))
            int_record_index += 1

        fil_opened_file.close()

        del Global.masRecords[0]

        for i in range(len(self.clsGlobals.masRecords) - 1):
            if i == 0:
                self.clsMain.recordIndex.cmbRecordIndex['values'] = (i + 1,)
            self.clsMain.recordIndex.cmbRecordIndex['values'] += (i + 2,)
        self.clsMain.recordIndex.cmbRecordIndex.current(0)

        self.clsMain.recordIndex.fnc_set_text_fields()



class AddRecord(tk.Tk):
    def __init__(self, parent, cls_main):
        self.parent = parent
        self.cls_main = cls_main

        btn_add_record = tk.Button(self.parent, text="Add Record", command=self._add_record)
        btn_add_record.grid(column=0, row=13, padx=5, pady=1.5, sticky=N + S + E + W)

    def _add_record(self):
        new_name = simpledialog.askstring(title="Test",
                                          prompt="What's your Name?:")
        print(new_name)

        new_class = simpledialog.askstring(title="Test",
                                          prompt="What's your Class?:")
        print(new_class)

        new_year = simpledialog.askstring(title="Test",
                                          prompt="What's your Year?:")
        print(new_year)

        Global.masRecords.append([new_name, new_class, new_year])

        for i in range(len(Global.masRecords) - 1):
            if i == 0:
                self.clsMain.recordIndex.cmbRecordIndex['values'] = (i + 1,)
            self.clsMain.recordIndex.cmbRecordIndex['values'] += (i + 2,)
        self.clsMain.recordIndex.cmbRecordIndex.current(len(self.cls_main.recordIndex.cmbRecordIndex['values']) - 1)



class EditRecord(tk.Tk):
    def __init__(self, parent):
        self.parent = parent

        btn_edit_record = tk.Button(self.parent, text="Edit Record")
        btn_edit_record.grid(column=0, row=12, padx=5, pady=1.5, sticky=N + S + E + W)


class SaveFile(tk.Tk):
    def __init__(self, parent):
        self.parent = parent

        btn_save = tk.Button(self.parent, text="Save")
        btn_save.grid(column=8, row=13, padx=5, pady=5)
