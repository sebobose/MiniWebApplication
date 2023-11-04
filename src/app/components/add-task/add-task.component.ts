import { Component, Output, EventEmitter, Input} from '@angular/core';
import { Task } from 'src/app/Task';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent {
  showAddTask: boolean = true;
  text: string;
  day!: string;
  @Output() onAddTask: EventEmitter<Task> = new EventEmitter()
  constructor() {
    this.text = "nesto"
  }

  OnSubmit() {
    this.onAddTask.emit()
    console.log("idk");
  }
}
