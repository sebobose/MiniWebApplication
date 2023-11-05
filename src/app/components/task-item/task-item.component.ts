import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import {Task} from '../../Task'
import {faCheck, faTimes} from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent {
  @Input() task!: Task;
  @Output() onDeleteTask: EventEmitter<Task> = new EventEmitter()
  @Output() onUpdateTask: EventEmitter<Task> = new EventEmitter()
  faTimes = faTimes;
  protected readonly faCheck = faCheck;
  onDelete(task: Task) {
    this.onDeleteTask.emit(task);
  }
  onUpdate(task: Task) {
    task.taskday = "done";
    this.onUpdateTask.emit(task);
  }
}
